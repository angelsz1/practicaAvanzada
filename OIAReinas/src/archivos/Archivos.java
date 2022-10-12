package archivos;

import java.io.File;
import java.util.Scanner;

public class Archivos{
    public static String leer(String path){
        File f = new File(path);
        Scanner sc = null;
        String todo = new String();
        try {
            
            sc = new Scanner(f);
            while(sc.hasNext()){
                todo += sc.nextLine();
                if(sc.hasNext())
                    todo += '\n';
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(sc != null){
                try{
                    sc.close();
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

        return todo;
    }
}

