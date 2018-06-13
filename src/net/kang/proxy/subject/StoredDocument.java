package net.kang.proxy.subject;

import net.kang.proxy.dto.Document;
import net.kang.proxy.enumeration.Suffix;

public interface StoredDocument {
    public void setDocument(String title, Suffix suffix, int bytes);
    public Document getDocument();
    public void readStoredDocument();
}
