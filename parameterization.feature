Feature: Parameterization Test

Scenario Outline: check parameterization

Given check login success
When app login1 <username> and <password>
Then dfd

Examples:
|username	|password|
|xxkjhkj	|jhfhjj  |
|jhsbsjdb	|bvhvjhv	|