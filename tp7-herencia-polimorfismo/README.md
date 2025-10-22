# TP7 – Herencia y Polimorfismo (Java)

Implementación de 4 katas:
1) Vehículos (herencia y override)
2) Figuras geométricas (clase abstracta y polimorfismo)
3) Empleados (clase abstracta y polimorfismo con instanceof)
4) Animales (sobrescritura de métodos)

## Estructura
```
tp7-herencia-polimorfismo/
├── README.md
├── .gitignore
└── src/
    └── main/
        └── java/
            └── tp7/
                ├── vehiculos/
                ├── figuras/
                ├── empleados/
                └── animales/
```

## Compilar
Desde la raíz del proyecto:
```bash
javac -d out $(find src -name "*.java")
```

## Ejecutar
```bash
java -cp out tp7.Main
```

> Alternativa: importá este árbol en tu IDE (VS Code, IntelliJ o NetBeans) como proyecto Java simple.
