package net.kang.proxy.dto;

import net.kang.proxy.enumeration.Suffix;

public class Document {
    private String title;
    private Suffix suffix;
    private int bytes;
    public Document(String title, Suffix suffix, int bytes){
        this.title = title;
        this.suffix = suffix;
        this.bytes = bytes;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setSuffix(Suffix suffix){
        this.suffix = suffix;
    }
    public Suffix getSuffix(){
        return this.suffix;
    }
    public void setBytes(int bytes){
        this.bytes = bytes;
    }
    public int getBytes(){
        return this.bytes;
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("- 파일 정보를 읽어 들입니다. -\n");
        str.append(String.format("- 파일 이름 : %s.%s\n", this.title, this.suffix.toString().toLowerCase()));
        str.append(String.format("- 파일 용량 : %d Bytes", this.bytes));
        return str.toString();
    }
}
