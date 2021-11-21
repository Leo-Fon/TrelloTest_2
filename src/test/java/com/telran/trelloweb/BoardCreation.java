package com.telran.trelloweb;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase {
    @Test
    public void testBoardCreation1 () throws InterruptedException {
        click(By.cssSelector("[data-test-id='header-create-menu-button']"));
        click(By.cssSelector("[aria-label='BoardIcon']"));
        type(By.cssSelector("data-test-id='create-board-title-input']"),"board1");
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));
        Thread.sleep(15000);
        //click(By.cssSelector("._2ft40Nx3NZII2i"));
    }

}
