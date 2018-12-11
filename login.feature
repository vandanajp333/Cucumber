Feature: login check

Scenario: Validate Login

Given check login success
When app login
Then logout


Scenario: Validate checks

Given check login with un "uuuu" and pw "ppp"
When app login
Then logout