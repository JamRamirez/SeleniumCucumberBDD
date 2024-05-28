
@Navigation
Feature: Navigation bar
    To see subpages
    Without logging in
    I can click the navigation bar links

    Background: I am on the Free Range Testers Web withouth logging in
        Given I navigate to www.freerangetesters.com

    Scenario Outline: Scenario Outline name: I can access the subpages through the navigation bar
        When I go to <section> using the navigation bar
        Examples:
            | section |     
            | cursos  |
            | caminos-de-aprendizaje  |
            | udemy  |
            | mentoria-1-1-con-pato  | 
            | blog  | 

    @Courses
    Scenario: Courses are presented correctly to potential customers
        When I go to cursos using the navigation bar
        Then I select Introduccion al Testing

    @Plans
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate options in the checkout page

    