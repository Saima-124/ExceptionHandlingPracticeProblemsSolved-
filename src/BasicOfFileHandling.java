import java.io.File;

public class BasicOfFileHandling {
    public static void main(String[] args) {
        File dir = new File("person");
        dir.mkdir();
        String path = dir.getAbsolutePath();
        System.out.println("The path of directory is " + path);
        File file1 = new File(path + "/student.txt");
        File file2 = new File(path + "/teacher.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are succesfully created ");
        }catch (Exception e){
            System.out.println("There is no file created");

        }
        file2.delete();
        if(file2.exists()){
            System.out.println("File exits");
        }else{
            System.out.println("File is not exit");
        }


    }
}
