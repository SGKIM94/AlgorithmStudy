package java.search;

import java.queue.StockPrice;

public class SearchTest {
    @org.junit.jupiter.api.Test
    public void solution() {
        StockPrice solution = new StockPrice();


        String solution = solution.solution(new int[]{3, 30, 34, 5, 9});

        System.out.println(solution);

        //then
        assertThat(solution).isEqualTo("9534330");
    }

}
