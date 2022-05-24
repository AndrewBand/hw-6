package module6.hw6;

class ObjectWorker {
    public String join(Object[] objects) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < objects.length; i++) {
            sb.append(objects[i]);
            sb.append(" ");
        }
        result = String.valueOf(sb).strip();
        return result;
    }
}

class ObjectWorkerTest {
    public static void main(String[] args) {
        Object[] data = {"Hello", 20L, 3.14f, true};

        //Hello 20 3.14 true
        System.out.println(new ObjectWorker().join(data));
    }
}
