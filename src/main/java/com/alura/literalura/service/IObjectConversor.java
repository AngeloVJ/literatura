package com.alura.literalura.service;

public interface IObjectConversor {
    <T> T getData(String json, Class<T> classType);
}
