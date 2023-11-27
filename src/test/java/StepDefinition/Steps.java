package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;	
import cucumber.api.java.en.When;


public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.out.println("Este paso abre Chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/Evaluacion_Final/index2.php");
	}
	
	@When("ingresa Username {string} y Password {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		System.out.println("Ingresa credencial del usuario");
		System.out.println("Este paso ingresa el nombre de usuario y contraseña em pagina login");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.id("boton")).click();
		driver.findElement(By.id("agenda")).click();
	}

	
	@Then("Iniciar sesion")
	public void inicia_sesion() {
		driver.get("http://localhost:8081/Evaluacion_Final/registraHora.php");
		System.out.println("Ingresamos al formulario");
	}

	
	@When("ingresa rut {string} y nomdueno {string} y apellido {string} y direc {string}") 
	public void ingresa_rut_y_nomdueno_y_apellido_y_direc(String string1, String string2, String string3, String string4) {
		System.out.println("Ingresamos Rut, Nombre, Apellido y Direccion");
		driver.findElement(By.id("confirmrut")).sendKeys(string1);
		driver.findElement(By.id("confirmnom")).sendKeys(string2);
		driver.findElement(By.id("confirmape")).sendKeys(string3);
		driver.findElement(By.id("confirmdir")).sendKeys(string4);
	}
	
	@When("ingresa correo {string} y telefono {string}") 
	public void ingresa_correo_y_telefono(String string1, String string2) {
		System.out.println("Ingresamos Correo y telefono");
		driver.findElement(By.id("confirmmail")).sendKeys(string1);
		driver.findElement(By.id("confirmfon")).sendKeys(string2);
	}
	
	@When("ingresa mascota {string} y tipo {string} y edad {string}") 
	public void ingresa_mascota_y_tipo_y_edad(String string1, String string2, String string3) {
		System.out.println("Ingresamos Datos de Mascota");
		driver.findElement(By.id("nomregalon")).sendKeys(string1);
		driver.findElement(By.id("tipregalon")).sendKeys(string2);
		driver.findElement(By.id("edadregalon")).sendKeys(string3);
	}
	
	@When("ingresa fecha {string} y hora {string}") 
	public void ingresa_fecha_y_hora(String string1, String string2) {
		System.out.println("Agendamos Fecha y Hora");
		driver.findElement(By.id("fecreserv")).sendKeys(string1);
		driver.findElement(By.id("time")).sendKeys(string2);
	}
	
	@Then("agendar")
	public void agendar() {
		System.out.println("Este paso registra la hora en tabla: agenda");
		driver.findElement(By.id("reghora")).click();
	}
	

	
	
}