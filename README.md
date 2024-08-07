
<h2 align="center">Проект по мобильной автоматизации для приложения Wikipedia <a target="_blank" href="https://www.wikipedia.org/"></a> </h2>

<p align="center">
<img title="Wikipedia" src="images/WikipediaLogo.png">
</p>

<a name="наверх"></a>

# :green_book: *Содержание*
+ [Технологии и инструменты](#Technology)
+ [Примеры автоматизированных тест кейсов](#TestCases)
+ [Запуск тестов в Jenkins](#Jenkins)
+ [Команды для запуска из терминала](#SystemProperty)
+ [Отчет о результатах тестирования в Allure Report](#AllureReport)
+ [Интеграция с Allure TestOps](#AllureTestOps)
+ [Интеграция с Jira](#Jira)
+ [Уведомление в Telegram при помощи Alert bot](#Telegram)
+ [Пример видео выполнения теста на Browserstack](#Browserstack)

<h1 align="left">
<a name="Technology"><i>Технологии и инструменты</i></a>
</h1>


<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://github.com/appium/appium-inspector/raw/main/docs/icon.png"><img src="images/AppiumInspectorIcon.png" width="50" height="50"  alt="Appium Inspector"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/AllureTestOps.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://avatars.githubusercontent.com/u/3221291?s=200&v=4"><img src="images/Appium.svg" width="50" height="50"  alt="Appium"/></a>  
<a href="https://cdn.worldvectorlogo.com/logos/android-studio-1.svg"><img src="images/android-studio-icon.svg" width="50" height="50"  alt="AndroidStudio"/></a>  
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>


<h1 align="left">
<a name="TestCases"><i>Примеры автоматизированных тест кейсов</i></a>
</h1>

- :white_check_mark: Проверка экранов онбординга
- :white_check_mark: Проверка функции поиска по тексту
- :white_check_mark: Проверка функции отображения пустого списка результатов поиска при некорректном вводе значения



<h1 align="left">
<img src="images/Jenkins.svg" width="25" height="25" alt="Jenkins"/>  <a name="Jenkins"><i>Запуск тестов в Jenkins</i></a>
</h1>

<a target="_blank" href="https://jenkins.autotests.cloud/job/qa-guru-diplom-mobile-tests/">**Сборка в Jenkins**</a>
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/qa-guru-diplom-mobile-tests/"><img src="images/JenkinsJobMobile.png>" alt="Jenkins"/></a>  
</p>

<h1 align="left">
<a name="SystemProperty"><i>Команды для запуска из терминала</i></a>
</h1>


***Локальный запуск:***
```bash  
gradle test -DdeviceHost=emulation
```

***Удаленный запуск (через browserstack):***
```bash  
gradle test -DdeviceHost=browserstack
```


<h1 align="left">
<img src="images/Allure_Report.svg" width="25" height="25" alt="Allure_Report"/>  <a name="AllureReport"><i>Отчет о результатах тестирования в Allure</i></a>
</h1>

<a target="_blank" href="https://jenkins.autotests.cloud/job/qa-guru-diplom-mobile-tests/12/allure/">**Отчёт в Allure**</a>
<p align="center">  



### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/Allure_Report_Overview.png">  
</p>  

### *Тест кейсы*

<p align="center">  
<img title="Allure Tests" src="images/Test_cases.png">  
</p>

### *Графики*

 <p align="center">  
<img title="Allure Graphics" src="images/Allure_Charts.png">  
</p>


<h1 align="left">
<img src="images/AllureTestOps.svg" width="25" height="25" alt="AllureTestOps"/> <a name="AllureTestOps"><i>Интеграция с Allure TestOps</i></a>
</h1>

<a target="_blank" href="https://allure.autotests.cloud/project/4352/dashboards">**Проект в TestOps**</a>
<p align="center">  


<p align="center">  
<img title="Allure TestOps Dashboard" src="images/Allure_Test_Ops_Dashboard.png">  
</p>  

## *Тест кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/TestOpsTests.png">  
</p>


<h1 align="left">
<img src="images/Jira.svg" width="25" height="25" alt="Jira"/> <a name="Jira"><i>Интеграция с Jira</i></a>
</h1>

<a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-1310">**Тикет в Jira**</a>
<p align="center">  


<p align="center">  
<img title="Jira" src="images/JiraTicket.png">  
</p>

<h1 align="left">
<img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/> <a name="Telegram"><i>Уведомление в Telegram при помощи Alert bot</i></a>
</h1>

<p align="center">  
<img title="Telegram notification" src="images/Telegram_bot.png">  
</p>

<h1 align="left">
<img src="images/Browserstack.svg" width="25" height="25" alt="Browserstack"/> <a name="Browserstack"><i>Пример видео выполнения теста на Browserstack</i></a>
</h1>

<p align="center"> 
<img title="Browserstack Video" src="images/BrowserStackVideoShort.gif" width="450" height="450"  alt="video">   
</p>

[Наверх ⬆](#наверх)