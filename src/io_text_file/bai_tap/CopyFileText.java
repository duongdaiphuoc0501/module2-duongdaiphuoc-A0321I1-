package io_text_file.bai_tap;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        try {
            Reader filedau = new FileReader("D:\\A0321I1-Duong_Dai_Phuoc-Module02\\src\\io_text_file\\bai_tap\\dau.txt");
            BufferedReader br = new BufferedReader(filedau);
            Writer filecuoi = new FileWriter("D:\\A0321I1-Duong_Dai_Phuoc-Module02\\src\\io_text_file\\bai_tap\\cuoi.txt");
            BufferedWriter bw = new BufferedWriter(filecuoi);

            String readfile = "";
            while ((readfile = br.readLine()) != null){
                bw.write(readfile);
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
