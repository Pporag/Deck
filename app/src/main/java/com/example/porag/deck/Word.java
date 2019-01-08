package com.example.porag.deck;

public class Word {
    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok Translation for the word
    private String mChakmaTranslation;

    // Image for each word

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String defaultTranslation,String chakmaTranslation){
        mDefaultTranslation = defaultTranslation;
        mChakmaTranslation = chakmaTranslation;

    }
    /**
     * Create a new public Word class
     * As in case of phrases , we won't be having any images assigned to it
     */
    public Word (String defaultTranslation, String chakmaTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mChakmaTranslation = chakmaTranslation;
        mImageResourceId = imageResourceId;
    }

    // Get the default Translation for this app
    // English

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    // Get the Chakma Translation for this App

    public String getChakmaTranslation() {
        return mChakmaTranslation;
    }
    // Get the image for each view

    public int getmImageResourceId(){

        return mImageResourceId;
    }

    // Returns whether  or not  an image is assigned with each word
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }
}
