# Employee Generation

Programa que permite gestionar una vase de datos de empleados de una empresa clasifficados por roles (manager, developer).

## Requerimientos

1. Trabajar bajo el paradigma de POO.
2. Organizar el proyecto en paquetes
3. Crear métodos para:
    - Consultar información
    - Consultar salario
    - Consultar salario con incremento
    - Consultar años faltantes para el retiro
4. Implementar colecciones (Collections)

**Organización de paquetes**

- *model*: `Employee.java`, `Developer.java`, `Manager.java`
- *service*: `EmployeeService.java`, `DeveloperService.java`, `ManagerService.java`
- *exceptions*: `EmployeeNotFoundException`
- *main*: `EmployeeMain.java`, `DeveloperMain.java`, `ManagerMain.java`