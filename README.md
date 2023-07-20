# Calculator

- 코틀린 문법 기초 과제(계산기) 경로 -app/src/main/ java/com/example/calculator

- level3, 단일책임원칙에 맞게 Lv3Operation 파일에 하나의 클래스는 하나의 기능을 담당하여 하나의 책임을 수행하는데 집중할 수 있게 코드를 짰습니다.

- level4, 의존역전의원칙에 맞게 의존관계를 맺을 때 변하기 쉬운 것에 의존하기 보다는 변화하지 않는 것에 의존할 수 있게 코드를 짜봤습니다.

BusinessLogic파일에 있는 CalculatorService 클래스는 매개변수로 추상클래스에 의존하며
변하기 쉬운 AddOperation클래스나 SubOperation 클래스 보다 더 변하지 않는 추상클래스에 의존하게 돼서
코드의 유연성을 더 높였다.
