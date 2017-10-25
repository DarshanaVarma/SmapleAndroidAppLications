package com.example.demo.sampleapplicaton.dagger.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by admin on 10/25/2017.
 */


@Scope
@Retention(RetentionPolicy.CLASS)
public @interface MainApplicationScope {
}
