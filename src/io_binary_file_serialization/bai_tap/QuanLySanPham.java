package io_binary_file_serialization.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
    public static void main(String[] args) throws IOException {
        try{
            File file = new File("D:\\A0321I1-Duong_Dai_Phuoc-Module02\\src\\io_binary_file_serialization\\bai_tap\\sanpham.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            FileInputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);



            List<SanPham> sanPhams = new ArrayList<>();
            SanPham sp1 = new SanPham("s1", "ha ha", "phake", 10000, "tot");
            SanPham sp2 = new SanPham("s2", "can", "real", 120000, "rat tot");
            sanPhams.add(sp1);
            sanPhams.add(sp2);
            oos.writeObject(sanPhams);

            sanPhams = (List<SanPham>) ois.readObject();
            for (SanPham sanpham:
                 sanPhams) {
                System.out.println(sanpham);
            }

            ois.close();
            oos.close();
            is.close();
            os.close();
        } catch (FileNotFoundException e){
           e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
