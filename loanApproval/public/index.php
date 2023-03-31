<?php
use Psr\Http\Message\ResponseInterface as Response;
use Psr\Http\Message\ServerRequestInterface as Request;
use Slim\Factory\AppFactory;
require __DIR__ . '/../vendor/autoload.php';

$app = AppFactory::create();
$app->addRoutingMiddleware();
$errorMiddleware = $app->addErrorMiddleware(true, true, true);


$app->get('/loan/{account}/{approval}', function (Request $request, Response $response, $args) {
    $account = $args['account'];
    $approval = $args['approval'];
    $name = $request->getQueryParam('name', 'World');
    $response->getBody()->write("Hello, $account");
return $response; });

$app->run();

?>