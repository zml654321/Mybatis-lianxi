package com.chb.main;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File folder=new File("/tmp/java");
        deleteFolder(folder);
    }
    public static void deleteFolder(File file){
        File[] files=file.listFiles();
        if(files!=null){
            for (File file1:files){
                if(file1.isDirectory()){
                    deleteFolder(file1);
                }else{
                    file1.delete();
                }
            }
        }
        file.delete();
    }
}
