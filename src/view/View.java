package view;

import controller.Controller;
import javax.swing.JFrame;


import view.StoreView.StoreView;
import view.mainView.MainView;
import view.DetailView.DetailView;
import view.LoginView.LoginView;
public class View extends JFrame {

  Controller controller;
  private MainView mainView;
  private StoreView storeView;
  private LoginView loginView;
  private DetailView detailView;


  public View(Controller controller) {
    // 메인 컨트롤러
    this.controller = controller;
    setTitle("Main Frame");

    this.mainView = new MainView(controller);
    this.storeView = new StoreView(controller);
    this.loginView = new LoginView(controller);
    //this.detailView = new DetailView(controller);

    setSize(1133, 744);
//    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    add(loginView);

    //add(detailView);
  }
  // 메서드 사용법
  //    controller.storeController.plus();
  public void showLoginView() {
    this.loginView = new LoginView(controller);
    getContentPane().removeAll(); // 현재 컨텐츠를 제거
    revalidate(); // 레이아웃 갱신
    repaint(); // 다시 그리기
  }

  public void showMainView() {
    this.mainView = new MainView(controller);

    getContentPane().removeAll(); // 현재 컨텐츠를 제거

    add(mainView); // 메인 뷰 추가
    revalidate(); // 레이아웃 갱신
    repaint(); // 다시 그리기
  }

  public void showStoreView() {
    this.storeView = new StoreView(controller);
    getContentPane().removeAll(); // 현재 컨텐츠를 제거
    add(storeView); // 스토어 뷰 추가
    revalidate(); // 레이아웃 갱신
    repaint(); // 다시 그리기
  }
  public void showDetailView() {

    getContentPane().removeAll(); // 현재 컨텐츠를 제거
    add(controller.detailController.detailView); // 스토어 뷰 추가
    revalidate(); // 레이아웃 갱신
    repaint(); // 다시 그리기
  }

}
