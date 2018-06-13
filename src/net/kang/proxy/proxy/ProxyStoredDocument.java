package net.kang.proxy.proxy;

import net.kang.proxy.dto.Document;
import net.kang.proxy.enumeration.Suffix;
import net.kang.proxy.subject.RealStoredDocument;
import net.kang.proxy.subject.StoredDocument;

public class ProxyStoredDocument implements StoredDocument {
    private RealStoredDocument realStoredDocument = null;
    private String id = null;
    private Document document = null;

    public ProxyStoredDocument(String id, String title, Suffix suffix, int bytes){
        this.id = id;
        this.document = new Document(title, suffix, bytes);
        System.out.printf("[임시 서버 저장소 %s를 생성하였습니다.]\n", this.id);
    }

    @Override
    public void setDocument(String title, Suffix suffix, int bytes){
        if(realStoredDocument == null){
            realStoredDocument = new RealStoredDocument(this.id, this.document.getTitle(), this.document.getSuffix(), this.document.getBytes());
        }
        realStoredDocument.setDocument(title, suffix, bytes);
    }

    @Override
    public Document getDocument(){
        if(realStoredDocument == null){
            realStoredDocument = new RealStoredDocument(this.id, this.document.getTitle(), this.document.getSuffix(), this.document.getBytes());
        }
        return realStoredDocument.getDocument();
    }

    @Override
    public void readStoredDocument(){
        if(realStoredDocument == null){
            realStoredDocument = new RealStoredDocument(this.id, this.document.getTitle(), this.document.getSuffix(), this.document.getBytes());
        }
        realStoredDocument.readStoredDocument();
    }
}
