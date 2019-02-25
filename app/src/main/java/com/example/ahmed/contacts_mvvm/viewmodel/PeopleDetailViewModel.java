package com.example.ahmed.contacts_mvvm.viewmodel;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ahmed.contacts_mvvm.model.People;

public class PeopleDetailViewModel {

    private People people;

    public PeopleDetailViewModel(People people) {
        this.people = people;
    }

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }

    public String getFullUserName() {
        people.fullName = people.name.title + "." + people.name.firts + " " + people.name.last;
        return people.fullName;
    }

    public String getUserName() {
        return people.login.userName;
    }

    public String getEmail() {
        return people.mail;
    }

    public int getEmailVisibility() {
        return people.hasEmail() ? View.VISIBLE : View.GONE;
    }

    public String getCell() {
        return people.cell;
    }

    public String getPictureProfile() {
        return people.picture.large;
    }

    public String getAddress() {
        return people.location.street
                + " "
                + people.location.city
                + " "
                + people.location.state;
    }

    public String getGender() {
        return people.gender;
    }
}
