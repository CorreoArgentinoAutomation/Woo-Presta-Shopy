@MCIB-133
Feature: TE - Nuevo envio individual

	Background:
		#@PRECOND_MCIB-130
		Given el usuario se situa en los campos email y password

	#*Objetivo:* Verificar que un perfil pueda realizar un nuevo envío individual a través del sistema de la aplicación, siguiendo el flujo crítico establecido y concretando con el pago exitoso del mismo.
	@TEST_MCIB-87 @TESTSET_MCIB-84
	Scenario Outline: Nuevo envio individual
		Given el usuario '<tipoUsuario>' está logueado y en la page home
		  When ingresa en nuevo envío individual
		  And llena los campos de paquete
		  And selecciona el '<tipoEntrega>' completa el formulario de destino
		  And selecciona el '<tipoProducto>' y procede a pagar
		  And se muestra la grilla de checkout
		  Then realiza el pago con '<medioPago>' del envío
		  And se confirma que el pago se ha realizado con éxito
		
		  Examples:
		| tipoUsuario      | tipoEntrega   | tipoProducto  | medioPago        |
		| Consumidor final |  Domicilio    | Clasico       | Tarjeta          |
		| Monotributista   |  Sucursal     | Expreso       | Saldo            |
		| Empresa          |  Domicilio    | Clasico       | Cuenta Corriente |
		
