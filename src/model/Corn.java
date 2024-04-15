package model;

public class Corn extends CropModel {

    public DateModel dateModel;
    Corn(DateModel dateModel) {
        super(dateModel,"옥수수", 90, 100, 150, new String[]{
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fvirinka%2Fvirinka1306%2Fvirinka130600014%2F20302520-%25EB%25A7%258C%25ED%2599%2594-%25EC%2598%25A5%25EC%2588%2598%25EC%2588%2598.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}
