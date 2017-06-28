public  class CalFileUtil {

    private static void calFile(File file, int floor) throws Exception{

        if(file.isDirectory()) {
            for(File temp : file.listFiles()) {
                //循环，如果是文件，文件层数加一
                calFile(temp, floor + 1);
            }
        }
        else {
            for(int i = 1; i < floor; i++) {
                System.out.print("\t");
            }
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        try {
            calFile(new File("C:\\Users\\Administrator\\Desktop\\ing"),0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
