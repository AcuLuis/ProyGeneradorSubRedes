
# Generador de Subredes

Este proyecto es una aplicación Java que permite generar subredes a partir de una dirección IP y una máscara de red. La aplicación es capaz de manejar tanto direcciones IP y máscaras en formato decimal como en formato binario, y proporciona información detallada sobre la red, como la dirección de red, la dirección de broadcast, la clasificación de la IP y las subredes generadas.

# Características Principales

Validación de IP y Máscara de Red: La aplicación valida si la dirección IP y la máscara de red ingresadas son válidas, tanto en formato decimal como binario.

Conversión entre Decimal y Binario: Permite al usuario ingresar direcciones IP y máscaras en formato decimal o binario, y realiza las conversiones necesarias para los cálculos.

Cálculo de Dirección de Red y Broadcast: Calcula la dirección de red y la dirección de broadcast a partir de la IP y la máscara proporcionadas.

Generación de Subredes: Genera una lista de subredes basada en la dirección de red y la máscara.

Clasificación de IP: Clasifica la dirección IP en una de las clases (A, B, C, D o E) y muestra la máscara por defecto correspondiente.

Interfaz Gráfica: La aplicación cuenta con una interfaz gráfica sencilla y fácil de usar, desarrollada con Swing.

# Requisitos

Java Development Kit (JDK) 8 o superior.

Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o NetBeans (opcional, pero recomendado).

Estructura del Proyecto

El proyecto está organizado en una sola clase principal (IU_Generador), que contiene todos los métodos necesarios para la validación, conversión, cálculo y generación de subredes.

# Métodos Principales

esIPValida(String ip): Valida si la dirección IP es válida, ya sea en formato decimal o binario.

esMascaraValida(String mask): Valida si la máscara de red es válida, ya sea en formato decimal, binario o CIDR.

convertirDecimalABinario(String decimal): Convierte una dirección IP o máscara de red en formato decimal a binario.

convertirBinarioADecimal(String binario): Convierte una dirección IP o máscara de red en formato binario a decimal.

calcularDireccionRed(String ip, int cidr): Calcula la dirección de red a partir de la IP y la máscara.

calcularDireccionBroadcast(String ip, int cidr): Calcula la dirección de broadcast a partir de la IP y la máscara.

generarSubredes(String direccionRed, int cidr): Genera una lista de subredes basada en la dirección de red y la máscara.

clasificarIP(String ip): Clasifica la dirección IP en una de las clases (A, B, C, D o E).

btn_EjecutarActionPerformed(ActionEvent evt): Método principal que ejecuta todas las operaciones cuando el usuario hace clic en el botón "Ejecutar".

# Ejemplo de Uso

Ingresar Datos:

Ingresa una dirección IP y una máscara de red en los campos correspondientes.

Selecciona el formato (decimal o binario) utilizando los radio botones.

Validar y Calcular:

Haz clic en el botón "Ejecutar" para validar los datos y realizar los cálculos.

Ver Resultados:

La aplicación mostrará la dirección de red, la dirección de broadcast, la clasificación de la IP y las subredes generadas.

Instrucciones para Ejecutar el Proyecto

Clona o descarga el repositorio.

Abre el proyecto en tu IDE favorito.

Compila y ejecuta la clase IU_Generador.

Usa la interfaz gráfica para ingresar los datos y generar las subredes.

# Contribuciones

Reportando errores o sugerencias.

Mejorando la interfaz gráfica.

Optimizando el código existente.

Añadiendo nuevas funcionalidades.

# Licencia
Para más detalles, consulta el archivo LICENSE.