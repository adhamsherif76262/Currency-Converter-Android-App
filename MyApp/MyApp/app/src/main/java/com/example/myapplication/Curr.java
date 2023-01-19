package com.example.myapplication;

public class Curr {

        private float curr;

        public float getCurr(){
            return curr;
        }

        public void setCurr(float curr){
            this.curr=curr;
        }
        public float EgpToUsd(){
            return (curr/20 );
        }

        public float UsdToEgp(){
            return (curr * 20);
        }
}
