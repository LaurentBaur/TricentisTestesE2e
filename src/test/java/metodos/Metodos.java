package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void preencher(By elemento, String texto) {
		drivers.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		drivers.findElement(elemento).click();
	}

	public void validarTexto(By elemento, String textoEsperado) {
		String textoCapturado = drivers.findElement(elemento).getText();
		assertEquals(textoEsperado, textoCapturado);
	}

	public void printTela(String nomeDoTeste, String nomeDaEvidencia) {
		File scrFile = ((TakesScreenshot) drivers).getScreenshotAs(OutputType.FILE);

		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		
		try {
			FileUtils.copyFile(scrFile, new File("./evidencias/"+nomeDoTeste+"/"+nomeDaEvidencia+"_"+timestamp+".png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		}
	
	public void aguardarElemento(By nome) {
		WebDriverWait wait = new WebDriverWait(drivers, java.time.Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(nome));
		
			
		}
	
	public void localizarElemento(By elemento) {
		// Localizando o span sobre o radio button masculino e clicando nele
		WebElement maleOption = drivers.findElement(By.cssSelector("span.ideal-radio"));
		maleOption.click();
	} 
	
	public void forcarClick(By elemento) {
		try {
	        drivers.findElement(elemento).click(); // Tenta o clique convencional
	    } catch (ElementClickInterceptedException e) {
	        // Usa o JavascriptExecutor para forçar o clique se o elemento estiver oculto ou sobreposto
	        WebElement element = drivers.findElement(elemento);
	        ((JavascriptExecutor) drivers).executeScript("arguments[0].click();", element);
	    }
	
	}
}
