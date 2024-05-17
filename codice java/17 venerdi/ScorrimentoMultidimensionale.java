public class ScorrimentoMultidimensionale {
    public static void main(String[] args) {
        
        int[][] myQuary = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < myQuary.length; ++i) {
            for (int j = 0; j < myQuary[i].length; ++j) {
                System.out.println(myQuary[i][j]);
            }
        }
    }
}
