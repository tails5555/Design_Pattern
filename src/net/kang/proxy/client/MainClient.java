package net.kang.proxy.client;

import net.kang.proxy.enumeration.Suffix;
import net.kang.proxy.proxy.ProxyStoredDocument;

public class MainClient {
    public static void main(String[] args){
        ProxyStoredDocument storedDocument1 = new ProxyStoredDocument("X01", "보고서", Suffix.DOCX, 3000);
        storedDocument1.setDocument("멘토링_보고서", Suffix.DOCX, 3000);
        storedDocument1.readStoredDocument();
        System.out.println();

        ProxyStoredDocument storedDocument2 = new ProxyStoredDocument("X02", "업무_프로세스", Suffix.XLSX, 2000);
        storedDocument2.readStoredDocument();
        System.out.println();

        ProxyStoredDocument storedDocument3 = new ProxyStoredDocument("X03", "대중서사_n조_발표자료", Suffix.PPTX, 4000);
        storedDocument3.setDocument("대중서사_3조_발표자료", Suffix.PPTX, 4000);
        storedDocument3.readStoredDocument();
    }
}
