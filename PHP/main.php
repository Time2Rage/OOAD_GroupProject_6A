<?php
require_once "autoload.php";

date_default_timezone_set('Europe/Dublin');

$worker1 = new Worker(1, "Nicola", Industry::ADMINISTRATION);
$worker2 = new Worker(2, "Leo", Industry::COMPUTING);
$worker3 = new Worker(3, "Rene", Industry::ENGINEERING);

echo implode(' | ', Worker::$WORKER_LIST);

echo "</br>";

$now = new DateTime();

$cvWorker1 = new Cv($now->format('Y-m-d'), "First CV");
$worker1->updateCV($cvWorker1);
echo $worker1->getCv() . "</br>";

$cvWorker2 = new Cv($now->format('Y-m-d'), "Second CV");
$worker2->updateCV($cvWorker2);
echo $worker2->getCv() . "</br>";

$worker3->setName("Jack");
echo implode(' | ', Worker::$WORKER_LIST);

