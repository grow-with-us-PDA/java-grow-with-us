package model;

public class CropInfoModel {

    public static void main(String[] args) {

    }

    String name;
    int requiredDay;
    int seedPrice;
    int sellPrice;
    String[] img;

    CropInfoModel(String name, int seedPrice, int sellPrice, String[] img){
        this.name = name;
        this.seedPrice = seedPrice;
        this.sellPrice = sellPrice;
        this.img = img;
    }
}

//부모 클래스 : CropInfo
//자식 클래스 :
//  1. corn(옥수수)
//  2. tomato(토마토)
//  3. strawberry(딸기)
//  4. basil(바질)
//  5. lettuce(상추)
//  6. broccoli(브로콜리)
//  7. apple (사과)
//  8. pear(배)
//  9. rice(쌀)


class Corn extends CropInfoModel {
    Corn() {
        super("옥수수", 100, 150, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fvirinka%2Fvirinka1306%2Fvirinka130600014%2F20302520-%25EB%25A7%258C%25ED%2599%2594-%25EC%2598%25A5%25EC%2588%2598%25EC%2588%2598.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}




class Tomato extends CropInfoModel{

    Tomato() {
        super("토마토", 200, 300, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fmylisa%2Fmylisa1201%2Fmylisa120100019%2F12083008-%25ED%2586%25A0%25EB%25A7%2588%25ED%2586%25A0-%25ED%259D%25B0%25EC%2583%2589-%25EB%25B0%25B0%25EA%25B2%25BD%25EC%2597%2590-%25EA%25B3%25A0%25EB%25A6%25BD%25EC%259E%2585%25EB%258B%2588%25EB%258B%25A4-%25EB%25B2%25A1%25ED%2584%25B0.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Strawberry extends CropInfoModel{
    Strawberry(){
        super("딸기", 500, 750, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Ftikiri%2Ftikiri1501%2Ftikiri150100027%2F49894635-%25EB%25B2%25A1%25ED%2584%25B0-%25EB%2594%25B8%25EA%25B8%25B0-%25EC%25BB%25AC%25EB%25A0%2589%25EC%2585%2598.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Basil extends CropInfoModel{
    Basil(){
        super("바질", 50, 75, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fivanmateev%2Fivanmateev1510%2Fivanmateev151000813%2F45737946-%25EB%25B0%2594%25EC%25A7%2588.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}

class Lettuce extends CropInfoModel{
    Lettuce(){
        super("상추", 80, 120, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fthumbs.dreamstime.com%2Fb%2Fred-lettuce-22244826.jpg&type=sc960_832"
        });
    }
}

class Broccoli extends CropInfoModel{
    Broccoli(){
        super("브로콜리", 120, 180, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/common/?src=http%3A%2F%2Fcafefiles.naver.net%2FMjAyMDA0MjNfMjQy%2FMDAxNTg3NjIyMzU2NDA0.EJDbwLCJwOdrmxsFddCxwWcvvkwFB165K4bs2BB0Gk0g.GHZaKagPnR-qRr2UaKPp6yR-0fKHlXFXbrHJfv3ahjEg.PNG%2Fbroccoli_PNG72886.png&type=sc960_832"
        });
    }
}

class Apple extends CropInfoModel{
    Apple(){
        super("사과", 150, 225, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190810%2Fourlarge%2Fpngtree-delicious-red-apples-png-image_1685447.jpg&type=sc960_832"
        });
    }
    }


class Pear extends CropInfoModel{
    Pear(){
        super("배", 180, 270, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMDVfOTcg%2FMDAxNjY0OTU3MjUyNzE4.X_4yeYOkbAEtp6qswq_c2TvwOCKZLsEjX8SLDAO0QjIg.znVnstriB9XdLh7ew5KDc8jKRicNaLiVndZP-LpTcvIg.JPEG.kvision2022%2F19587315.jpg&type=sc960_832"
        });
    }
}

class Rice extends CropInfoModel{
    Rice(){
        super("쌀", 30, 45, new String[] {
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNKJfBKPFji49GUZUn2_xkStmMdG0p4CA3rTEgpCVJFg&s"
        });
    }
}




