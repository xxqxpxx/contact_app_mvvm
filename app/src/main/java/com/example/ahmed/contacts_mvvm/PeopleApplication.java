package com.example.ahmed.contacts_mvvm;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.example.ahmed.contacts_mvvm.data.PeopleFactory;
import com.example.ahmed.contacts_mvvm.data.PeopleService;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

public class PeopleApplication extends MultiDexApplication {

    private PeopleService peopleService;
    private Scheduler scheduler;

    private static PeopleApplication get(Context context) {
        return (PeopleApplication) context.getApplicationContext();
    }

    public static PeopleApplication create(Context context) {
        return PeopleApplication.get(context);
    }

    public PeopleService getPeopleService() {
        if (peopleService == null) {
            peopleService = PeopleFactory.create();
        }

        return peopleService;
    }

    public void setPeopleService(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null) {
            scheduler = Schedulers.io();
        }

        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
}
