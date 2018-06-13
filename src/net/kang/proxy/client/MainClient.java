package net.kang.proxy.client;

import net.kang.proxy.enumeration.Suffix;
import net.kang.proxy.proxy.RealStoredDocument;

public class MainClient {
    public static void main(String[] args){
        RealStoredDocument storedDocument1 = new RealStoredDocument("X01", "보고서", Suffix.DOCX, 3000);
        storedDocument1.setDocument("멘토링_보고서", Suffix.DOCX, 3000);
        storedDocument1.readStoredDocument();
    }
}
