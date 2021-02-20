public class Main {

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }
    public static void firstMethod(){
        final int size = 10000000;
        float[] arr = new float[size];

        for (int i = 0; i < size ; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }
    public static void secondMethod() {
        final int size = 10000000;
        float[] arr = new float[size];

        for (int i = 0; i < size ; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        final int h = size / 2;
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a1){
                    for (int i = 0; i < h; i++) {
                        a1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a2){
                    for (int i = 0; i < h; i++) {
                        a2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                    }
                }
            }
        }).start();
        synchronized (a1){
            synchronized (a2){
                System.arraycopy(a1, 0, arr, 0, h);
                System.arraycopy(a2, 0, arr, h, h);
            }
        }
        System.out.println(System.currentTimeMillis() - a);
    }
}
