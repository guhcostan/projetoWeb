
[![Build Status][travis-image]][travis-url]
[![License Apache](https://img.shields.io/badge/licence-Apache%202.0-blue.svg)](https://github.com/guhcostan/projetoWeb/blob/master/LICENCE.txt)
[![quality gate](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=alert_status)](https://sonarcloud.io/dashboard?id=guhcostan_projetoWeb)
[![reliability](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=reliability_rating)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=reliability_rating)
[![security](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=security_rating)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=security_rating)
[![maintainability](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=sqale_rating)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=sqale_rating)

[![bugs](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=bugs)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=Reliability)
[![code smells](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=code_smells)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=code_smells)
[![coverage](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=coverage)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=Coverage)
[![vunerability](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=vulnerabilities)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=vulnerabilities)
[![duplicated lines](https://sonarcloud.io/api/project_badges/measure?project=guhcostan_projetoWeb&metric=duplicated_lines_density)](https://sonarcloud.io/component_measures?id=guhcostan_projetoWeb&metric=duplicated_lines_density)

<h1 align="center">Projeto WEB</h1>
<h4 align="center">Projeto criado para disciplina de Programação WEB.</h4>

<p align="center">
  <img src="https://github.com/guhcostan/projetoWeb/blob/master/frontend/logo.png?raw=true">
</p>

## Tecnologias

### Backend
    - Spring Boot
    - Hibernate
    - Lombok
    - PostgreSQL
    - JUnit
    
### Frontend
    - Vuejs
    - Element UI
    
### Motivação para escolhas de tecnologias
    
Foram escolhidas as tecnologias acima tendo em vista ao que nos foi apresentado durante a disciplina.
O uso de algumas ferramentas foram escolhidas baseadas em experiência própria, pela praticidade e eficiência das mesmas.

## Instalação

OS X & Linux:

```sh
cd frontend
npm install
npm run serve
cd ../backend
mvn spring-boot:run
```

## Deploy

```sh
cd frontend
npm install
npm run build
cd ../backend
mvn clean package
```

## Release History


## Prototype

https://marvelapp.com/46g4a4d

## Meta

Gustavo Costa – [@guhcostan](https://instagram.com/guhcostan) – gustavo.neves@aluno.ufla.br

Distributed under the XYZ license. See ``LICENSE`` for more information.

## Contributing

1. Fork it (<https://github.com/guhcostan/projetoWeb/fork>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

<!-- Markdown link & img dfn's -->
[travis-image]: https://travis-ci.com/guhcostan/projetoWeb.svg?branch=master
[travis-url]: https://travis-ci.com/guhcostan/projetoWeb
