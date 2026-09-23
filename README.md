# Unidad-2-Ejercicio-7
Programacion 3 Unidad 2 Ejercicio 7
Ejercicio 7 — Botón que habilita otro botón
Un patrón muy frecuente en interfaces reales es habilitar o deshabilitar componentes según el estado de la aplicación. En este ejercicio vas a practicar ese patrón usando eventos de teclado y de botón.

Creá una ventana con los siguientes componentes y condiciones iniciales:

Una etiqueta con el texto "Ingresá tu nombre para continuar:"
Un campo de texto vacío
Un botón con el texto "Continuar", que debe iniciar deshabilitado
Una etiqueta de estado que inicialmente diga "Completá el campo para habilitar el botón"
El comportamiento esperado es el siguiente:

Cada vez que el usuario escriba o borre algo en el campo de texto, la aplicación debe verificar si el campo está vacío o no
Si el campo tiene texto, el botón "Continuar" debe habilitarse y la etiqueta debe cambiar a "¡Listo! Podés continuar."
Si el campo está vacío, el botón debe volver a deshabilitarse y la etiqueta debe volver al mensaje inicial
💡 Tip: para detectar cambios en tiempo real mientras el usuario escribe, usá KeyListener con el método keyReleased. Recordá usar KeyAdapter para no tener que implementar todos los métodos de la interfaz.

<img width="612" height="308" alt="image" src="https://github.com/user-attachments/assets/b696f916-a2d8-4ad5-acfc-b25568aba475" />
<img width="612" height="312" alt="image" src="https://github.com/user-attachments/assets/0f382118-ff0f-49a6-bf70-6097c9338632" />
