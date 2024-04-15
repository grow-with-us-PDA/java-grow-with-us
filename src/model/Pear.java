package model;

public class Pear extends CropModel {
    public DateModel dateModel;
    Pear(DateModel dateModel) {
        super(dateModel,"배", 200, 180, 270, new String[]{
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-vector%2F20190129%2Fourlarge%2Fpngtree-cartoon-seed-commercial-element-solar-termsgerminationcartoon-sproutgrowingchinese-png-image_568239.jpg&type=a340",
                "https://search.pstatic.net/sunny/?src=https%3A%2F%2Fpng.pngtree.com%2Fpng-clipart%2F20190118%2Fourlarge%2Fpngtree-small-bud-seedling-seed-germination-soil-illustration-png-image_455292.jpg&type=sc960_832",
                "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjEwMDVfOTcg%2FMDAxNjY0OTU3MjUyNzE4.X_4yeYOkbAEtp6qswq_c2TvwOCKZLsEjX8SLDAO0QjIg.znVnstriB9XdLh7ew5KDc8jKRicNaLiVndZP-LpTcvIg.JPEG.kvision2022%2F19587315.jpg&type=sc960_832"
        });
    }
}
