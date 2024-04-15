package model;

public class Tomato extends CropModel {
    public DateModel dateModel;
    Tomato(DateModel dateModel) {
        super(dateModel,"토마토", 30, 200, 300, new String[]{
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fus.123rf.com%2F450wm%2Fmylisa%2Fmylisa1201%2Fmylisa120100019%2F12083008-%25ED%2586%25A0%25EB%25A7%2588%25ED%2586%25A0-%25ED%259D%25B0%25EC%2583%2589-%25EB%25B0%25B0%25EA%25B2%25BD%25EC%2597%2590-%25EA%25B3%25A0%25EB%25A6%25BD%25EC%259E%2585%25EB%258B%2588%25EB%258B%25A4-%25EB%25B2%25A1%25ED%2584%25B0.jpg%3Fver%3D6&type=sc960_832"
        });
    }
}
