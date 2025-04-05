package test;

import java.util.ArrayList;
import java.util.List;

public class Topic {

    public final String name;
    public final List<Agent> subs;
    public final List<Agent> pubs;

    Topic(String name){
        this.name=name;
        this.subs = new ArrayList<>();
        this.pubs = new ArrayList<>();
    }

    public void subscribe(Agent a){
        this.subs.add(a);
    }
    public void unsubscribe(Agent a){
        this.subs.remove(a);
    }

    public void publish(Message m){
        for(Agent a : this.subs){
            a.callback(this.name, m);
        }
    }

    public void addPublisher(Agent a){
        this.pubs.add(a);
    }

    public void removePublisher(Agent a){
        this.pubs.remove(a);
    }


}
