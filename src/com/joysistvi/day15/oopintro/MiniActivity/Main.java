package com.joysistvi.day15.oopintro.MiniActivity;

public class Main {
        public static void main(String[] args) {

            // Class Instantiation / Create an object  of a class
            Camera camera = new Camera();
            System.out.println(camera.brand);

            camera.brand = "Dji";
            camera.color = "Black";
            camera.weightInKg = 1.5;
            camera.price = 40000;

            camera.createVlog();
            camera.makeShooting();
            camera.takePhotos();

            Camera camera2 = new Camera();
            camera.brand = "Fujifilm";
            camera.color  = "Silver";
            camera.weightInKg =  2;
            camera.price  = 19000;

            camera.takePhotos();
            camera.produceFilm();


            Camera camera3 = new Camera();
            camera.brand = "Canon";
            camera.color = "White";
            camera.weightInKg  = 1.8;
            camera.price = 30000;

            camera.makeShooting();

        }
    }
