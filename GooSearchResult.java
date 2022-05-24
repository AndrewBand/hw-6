package module6.hw6;

import java.util.Arrays;

final class GooSearchResult {
private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    String parseDomain(){

        String[] domain = new String[3];
        String[] domainT = url.strip().split("/");
        for (int i = 0; i < 3; i++) {
            domain[i] = String.valueOf(domainT[i]);
        }
        System.out.println(Arrays.toString(domain));

        return domain[2];
    }
}
class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com/hjh/jkl").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}