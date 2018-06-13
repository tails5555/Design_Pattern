package net.kang.facade.region_concert;

public class IncheonConcert {
    private String title;
    private String support;
    private boolean isStarted;

    public IncheonConcert(){
        System.out.println("[인천] 인천 콘서트 계획을 잡습니다.");
        this.title = null;
        this.support = null;
        this.isStarted = false;
    }

    public void addSchedule(String title, String support){
        System.out.printf("[인천] %s 콘서트로 결정했습니다. - %s 후원\n", title, support);
        this.title = title;
        this.support = support;
        this.isStarted = false;
    }

    public void concertStart(){
        if(!this.isStarted) {
            this.isStarted = true;
            System.out.printf("[인천] %s 콘서트가 시작됩니다. - %s 후원\n", this.title, this.support);
        }else {
            System.out.printf("[인천] %s 콘서트가 진행 중입니다. - %s 후원\n", this.title, this.support);
        }
    }

    public void concertEnd(){
        if(this.isStarted){
            this.isStarted = false;
            System.out.printf("[인천] %s 콘서트가 끝났습니다. - %s 후원\n", this.title, this.support);
        }else{
            System.out.printf("[인천] %s 콘서트는 아직 진행 안 했습니다. - %s 후원\n", this.title, this.support);
        }
    }
}
