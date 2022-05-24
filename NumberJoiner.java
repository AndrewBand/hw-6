package module6.hw6;

class NumberJoiner {
    public String join(int[] numbers) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        for(int number: numbers) {
            sb.append(number);
        }
        result = String.valueOf(sb);
        return result;
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}