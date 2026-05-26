#  panda.exe — Taller 2: Infraestructura como Código en AWS

Proyecto desarrollado para el curso de Computación de Alto Desempeño (UNAB).
Construimos una aplicación web completa en AWS usando Terraform como herramienta de IaC.

##  Arquitectura
Usuario → Frontend en S3 → API Gateway → Lambda → RDS MySQL

##  Integrantes y responsabilidades

| Integrante | Rol | Archivos |
|---|---|---|
| Silenay | Base del proyecto + Red | `providers.tf`, `variables.tf`, `terraform.tfvars`, `network.tf` |
| Alberto | Frontend | `main.tf`, `s3.tf`, `outputs.tf` |
| Robinson | Base de datos + IAM | `rds.tf`, `iam.tf` |
| Rodrigo | Lambda + API Gateway | `lambda.tf`, `apigateway.tf`, `lambda_src/app.py` |

## 📁 Estructura del proyecto
taller-2-iac/
├── main.tf
├── providers.tf
├── variables.tf
├── terraform.tfvars
├── outputs.tf
├── network.tf
├── s3.tf
├── iam.tf
├── lambda.tf
├── apigateway.tf
├── rds.tf
└── lambda_src/
└── app.py

##  Instrucciones de despliegue

### Requisitos previos
- Terraform >= 1.5.0
- AWS CLI configurado
- Python 3.11+

### Pasos

1. Clonar el repositorio
2. Instalar dependencia de Python:
```bash
   pip install pymysql -t lambda_src/
```
3. Crear el archivo `terraform.tfvars` con la contraseña:
```hcl
   db_password = "TuContraseñaSegura"
```
4. Ejecutar:
```bash
   terraform init
   terraform validate
   terraform plan
   terraform apply
```

##  Validación final

1. Abrir la URL del sitio en S3
2. Presionar el botón **Consultar API**
3. Verificar que se recibe respuesta JSON desde Lambda
4. Confirmar conexión exitosa con RDS MySQL

##  Tecnologías utilizadas

- **Terraform** — Infraestructura como Código
- **Amazon S3** — Hosting del frontend estático
- **API Gateway** — Exposición del backend HTTP
- **AWS Lambda** — Lógica serverless en Python
- **Amazon RDS MySQL** — Base de datos relacional
- **VPC + Subredes** — Red privada segura
