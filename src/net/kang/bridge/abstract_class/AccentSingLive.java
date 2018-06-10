package net.kang.bridge.abstract_class;

import net.kang.bridge.abstract_interface.SingLive;

public abstract class AccentSingLive {
    protected SingLive singLive;
    protected AccentSingLive(SingLive singLive){
        this.singLive = singLive;
    }
    public abstract void changeGenre(String genre);
    public abstract void noBgmSinging(String lyrics);
}
