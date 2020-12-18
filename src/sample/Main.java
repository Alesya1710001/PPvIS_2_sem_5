package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

import javax.print.DocFlavor;

public class Main extends Application {
    StackPane root = new StackPane();
    Scene scene = new Scene(root, 800, 600);


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Менеджер бюджета");
        primaryStage.setScene(scene);
        primaryStage.show();

        Pane button = new Pane();
        Button buttonSignIn = new Button();
        buttonSignIn.setLayoutX(350);
        buttonSignIn.setLayoutY(200);

        Button buttonLogIn = new Button();
        buttonLogIn.setLayoutX(300);
        buttonLogIn.setLayoutY(250);

        buttonSignIn.setText("Войти");
        buttonLogIn.setText("Зарегестрироваться");

        button.getChildren().add(buttonSignIn);
        button.getChildren().add(buttonLogIn);

        root.getChildren().add(button);

        buttonSignIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                StackPane signInWindow = new StackPane();
                Scene signInW = new Scene(signInWindow, 800, 600);

                Pane signIn = new Pane();

                TextField loginLabel = new TextField();
                loginLabel.setPrefColumnCount(11);
                loginLabel.setText("логин");
                loginLabel.setLayoutX(300);
                loginLabel.setLayoutY(170);
                signIn.getChildren().add(loginLabel);

                TextField passwordLabel = new TextField();
                passwordLabel.setText("пароль");
                passwordLabel.setPrefColumnCount(11);
                passwordLabel.setLayoutX(300);
                passwordLabel.setLayoutY(220);
                signIn.getChildren().add(passwordLabel);

                Button signInB = new Button();
                signInB.setText("Войти");
                signInB.setLayoutX(350);
                signInB.setLayoutY(300);
                signIn.getChildren().add(signInB);

                signInWindow.getChildren().add(signIn);
                primaryStage.setTitle("Вход");
                primaryStage.setScene(signInW);
                primaryStage.show();

                signInB.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent event) {
                        StackPane mainWindow = new StackPane();
                        Scene mainW = new Scene(mainWindow, 800, 600);

                        Pane main = new Pane();

                        Button budget = new Button();
                        budget.setText("Менеджер бюджета");
                        budget.setLayoutX(320);
                        budget.setLayoutY(170);
                        main.getChildren().add(budget);

                        Button settings = new Button();
                        settings.setText("Настройки");
                        settings.setLayoutX(350);
                        settings.setLayoutY(220);
                        main.getChildren().add(settings);


                        mainWindow.getChildren().add(main);
                        primaryStage.setTitle("Меню");
                        primaryStage.setScene(mainW);
                        primaryStage.show();

                        budget.setOnAction(new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                StackPane budgetWindow = new StackPane();
                                Scene budgetW = new Scene(budgetWindow, 800, 600);

                                Pane budget = new Pane();

                                ObservableList pcd = FXCollections.observableArrayList(
                                        new PieChart.Data("Одежда", 60),
                                        new PieChart.Data("Еда", 25),
                                        new PieChart.Data("Подарки", 10),
                                        new PieChart.Data("Транспорт", 5));
                                PieChart pc = new PieChart(pcd);
                                pc.setMaxSize(400, 400);
                                budgetWindow.getChildren().add(pc);

                                Label balance = new Label();
                                balance.setText("Баланс: 100 руб");
                                balance.setLayoutX(330);
                                balance.setLayoutY(500);
                                budget.getChildren().add(balance);

                                Button plus = new Button();
                                plus.setText("+");
                                plus.setLayoutX(300);
                                plus.setLayoutY(550);
                                budget.getChildren().add(plus);

                                Button minus = new Button();
                                minus.setText("-");
                                minus.setLayoutX(450);
                                minus.setLayoutY(550);
                                budget.getChildren().add(minus);

                                Button exit = new Button();
                                exit.setText("X");
                                exit.setLayoutX(750);
                                exit.setLayoutY(50);
                                budget.getChildren().add(exit);


                                budgetWindow.getChildren().add(budget);
                                primaryStage.setTitle("Бюджет");
                                primaryStage.setScene(budgetW);
                                primaryStage.show();

                                exit.setOnAction(new EventHandler<ActionEvent>() {

                                    @Override
                                    public void handle(ActionEvent event) {
                                        primaryStage.setTitle("Меню");
                                        primaryStage.setScene(mainW);
                                        primaryStage.show();
                                    }
                                });

                                minus.setOnAction(new EventHandler<ActionEvent>() {

                                    @Override
                                    public void handle(ActionEvent event) {
                                        StackPane minusWindow = new StackPane();
                                        Scene minusW = new Scene(minusWindow, 800, 600);

                                        Pane minus = new Pane();

                                        Label minusSumL = new Label();
                                        minusSumL.setText("Сумма:");
                                        minusSumL.setLayoutX(330);
                                        minusSumL.setLayoutY(200);
                                        minus.getChildren().add(minusSumL);

                                        TextField minusSum = new TextField();
                                        minusSum.setText("введите сумму");
                                        minusSum.setLayoutX(400);
                                        minusSum.setLayoutY(200);
                                        minus.getChildren().add(minusSum);

                                        Label minusCategoryL = new Label();
                                        minusCategoryL.setText("Категория:");
                                        minusCategoryL.setLayoutX(330);
                                        minusCategoryL.setLayoutY(280);
                                        minus.getChildren().add(minusCategoryL);

                                        ObservableList<String> categoriesMinus = FXCollections.observableArrayList("Транспорт", "Подарки", "Еда", "Одежда");
                                        ComboBox<String> categoriesMinusComboBox = new ComboBox<String>(categoriesMinus);
                                        categoriesMinusComboBox.setValue("Еда");
                                        categoriesMinusComboBox.setLayoutX(430);
                                        categoriesMinusComboBox.setLayoutY(280);
                                        minus.getChildren().add(categoriesMinusComboBox);

                                        Button saveMinus = new Button();
                                        saveMinus.setText("Применить");
                                        saveMinus.setLayoutX(420);
                                        saveMinus.setLayoutY(400);
                                        minus.getChildren().add(saveMinus);


                                        minusWindow.getChildren().add(minus);
                                        primaryStage.setTitle("Добавить расход");
                                        primaryStage.setScene(minusW);
                                        primaryStage.show();

                                        saveMinus.setOnAction(new EventHandler<ActionEvent>() {

                                            @Override
                                            public void handle(ActionEvent event) {
                                                primaryStage.setTitle("Бюджет");
                                                primaryStage.setScene(budgetW);
                                                primaryStage.show();

                                            }
                                        });

                                    }
                                });


                                plus.setOnAction(new EventHandler<ActionEvent>() {

                                    @Override
                                    public void handle(ActionEvent event) {
                                        StackPane plusWindow = new StackPane();
                                        Scene plusW = new Scene(plusWindow, 800, 600);

                                        Pane plus = new Pane();

                                        Label sumL = new Label();
                                        sumL.setText("Сумма:");
                                        sumL.setLayoutX(330);
                                        sumL.setLayoutY(200);
                                        plus.getChildren().add(sumL);

                                        TextField sum = new TextField();
                                        sum.setText("введите сумму");
                                        sum.setLayoutX(400);
                                        sum.setLayoutY(200);
                                        plus.getChildren().add(sum);

                                        Label categoryL = new Label();
                                        categoryL.setText("Категория:");
                                        categoryL.setLayoutX(330);
                                        categoryL.setLayoutY(280);
                                        plus.getChildren().add(categoryL);

                                        ObservableList<String> categories = FXCollections.observableArrayList("Стипуха", "Подарили", "Украл", "Зарплата");
                                        ComboBox<String> categoriesComboBox = new ComboBox<String>(categories);
                                        categoriesComboBox.setValue("Стипуха");
                                        categoriesComboBox.setLayoutX(430);
                                        categoriesComboBox.setLayoutY(280);
                                        plus.getChildren().add(categoriesComboBox);

                                        Button save = new Button();
                                        save.setText("Применить");
                                        save.setLayoutX(420);
                                        save.setLayoutY(400);
                                        plus.getChildren().add(save);


                                        plusWindow.getChildren().add(plus);
                                        primaryStage.setTitle("Добавить доход");
                                        primaryStage.setScene(plusW);
                                        primaryStage.show();

                                        save.setOnAction(new EventHandler<ActionEvent>() {

                                            @Override
                                            public void handle(ActionEvent event) {
                                                primaryStage.setTitle("Бюджет");
                                                primaryStage.setScene(budgetW);
                                                primaryStage.show();

                                            }
                                        });

                                    }
                                });


                            }
                        });

                        settings.setOnAction(new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                StackPane settingsWindow = new StackPane();
                                Scene settingsW = new Scene(settingsWindow, 800, 600);

                                Pane settings = new Pane();

                                Label language = new Label();
                                language.setText("Язык:");
                                language.setLayoutX(300);
                                language.setLayoutY(200);
                                settings.getChildren().add(language);

                                ObservableList<String> languages = FXCollections.observableArrayList("Русский", "Белорусский", "Английский");
                                ComboBox<String> languageMinusComboBox = new ComboBox<String>(languages);
                                languageMinusComboBox.setValue("Русский");
                                languageMinusComboBox.setLayoutX(350);
                                languageMinusComboBox.setLayoutY(200);
                                settings.getChildren().add(languageMinusComboBox);

                                Label currency = new Label();
                                currency.setText("Язык:");
                                currency.setLayoutX(300);
                                currency.setLayoutY(250);
                                settings.getChildren().add(currency);

                                ObservableList<String> currencies = FXCollections.observableArrayList("BYN", "RUB", "EN");
                                ComboBox<String> currenciesMinusComboBox = new ComboBox<String>(currencies);
                                currenciesMinusComboBox.setValue("EN");
                                currenciesMinusComboBox.setLayoutX(350);
                                currenciesMinusComboBox.setLayoutY(250);
                                settings.getChildren().add(currenciesMinusComboBox);

                                Button saveSettings = new Button();
                                saveSettings.setText("Применить");
                                saveSettings.setLayoutX(350);
                                saveSettings.setLayoutY(350);
                                settings.getChildren().add(saveSettings);

                                settingsWindow.getChildren().add(settings);
                                primaryStage.setTitle("Добавить расход");
                                primaryStage.setScene(settingsW);
                                primaryStage.show();

                                saveSettings.setOnAction(new EventHandler<ActionEvent>() {

                                    @Override
                                    public void handle(ActionEvent event) {
                                        primaryStage.setTitle("Меню");
                                        primaryStage.setScene(mainW);
                                        primaryStage.show();

                                    }
                                });

                            }
                        });

                    }
                });
            }
        });


        buttonLogIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                StackPane logInWindow = new StackPane();
                Scene logInW = new Scene(logInWindow, 800, 600);

                Pane logIn = new Pane();

                TextField loginLabelLog = new TextField();
                loginLabelLog.setPrefColumnCount(11);
                loginLabelLog.setText("логин");
                loginLabelLog.setLayoutX(300);
                loginLabelLog.setLayoutY(170);
                logIn.getChildren().add(loginLabelLog);

                TextField passwordLabelLog = new TextField();
                passwordLabelLog.setText("пароль");
                passwordLabelLog.setPrefColumnCount(11);
                passwordLabelLog.setLayoutX(300);
                passwordLabelLog.setLayoutY(220);
                logIn.getChildren().add(passwordLabelLog);

                TextField passwordTrueLabel = new TextField();
                passwordTrueLabel.setPrefColumnCount(11);
                passwordTrueLabel.setText("подтвердите пароль");
                passwordTrueLabel.setLayoutX(300);
                passwordTrueLabel.setLayoutY(270);
                logIn.getChildren().add(passwordTrueLabel);

                Button logInB = new Button();
                logInB.setText("Зарегистрироваться");
                logInB.setLayoutX(300);
                logInB.setLayoutY(320);
                logIn.getChildren().add(logInB);

                logInWindow.getChildren().add(logIn);
                primaryStage.setTitle("Регистрация");
                primaryStage.setScene(logInW);
                primaryStage.show();

                logInB.setOnAction(new EventHandler<ActionEvent>() {

                    @Override
                    public void handle(ActionEvent event) {
                        primaryStage.setTitle("Менеджер бюджета");
                        primaryStage.setScene(scene);
                        primaryStage.show();

                    }
                });
            }

        });


    }

    public static void main(String[] args) {
        launch(args);
    }
}
