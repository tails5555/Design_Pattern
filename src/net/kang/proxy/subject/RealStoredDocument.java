package net.kang.proxy.subject;

import net.kang.proxy.dto.Document;
import net.kang.proxy.enumeration.Suffix;

public class RealStoredDocument implements StoredDocument {
    private String id;
    private Document document = null;

    public RealStoredDocument(String id, String title, Suffix suffix, int bytes){
        this.id = id;
        System.out.printf("[%s - 단일 파일 저장소를 생성하였습니다.]\n", id);
        this.document = new Document(title, suffix, bytes);
        this.uploading();
    }

    private void uploading(){
        String tmpFileName = String.format("%s.%s", this.document.getTitle(), this.document.getSuffix().toString().toLowerCase());
        System.out.printf("[%s - 파일 업로드 정보] 단일 파일 저장소에 %s 업로딩이 시작됩니다.\n", this.id, tmpFileName);
        try {
            Thread.sleep(this.document.getBytes()); // 1MB를 1000Byte로 가정하고, 1MB 당 1초씩 업로딩 된다고 치자.
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("[%s - 파일 업로드 정보] 단일 파일 저장소에 %s 업로딩이 완료되었습니다.\n", this.id, tmpFileName);
    }

    private void removing(){
        String tmpFileName = String.format("%s.%s", this.document.getTitle(), this.document.getSuffix().toString().toLowerCase());
        System.out.printf("[%s - 파일 삭제 정보] 단일 파일 저장소에 %s 삭제가 시작됩니다.\n", this.id, tmpFileName);
        try {
            Thread.sleep(this.document.getBytes() / 5); // 1MB를 1000Byte로 가정하고, 5MB 당 1초씩 삭제 된다고 치자.
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("[%s - 파일 삭제 정보] 단일 파일 저장소에 %s 삭제가 완료되었습니다.\n", this.id, tmpFileName);
        this.document = null;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    @Override
    public void setDocument(String title, Suffix suffix, int bytes){
        this.removing();
        this.document = new Document(title, suffix, bytes);
        this.uploading();
    }

    @Override
    public Document getDocument(){
        return this.getDocument();
    }

    @Override
    public void readStoredDocument(){
        String tmpFileName = String.format("%s.%s", this.document.getTitle(), this.document.getSuffix().toString().toLowerCase());
        System.out.printf("[%s - 파일 열람] 단일 파일 저장소의 %s 정보는 다음과 같습니다.\n", this.id, tmpFileName);
        System.out.println(this.document);
    }

}
