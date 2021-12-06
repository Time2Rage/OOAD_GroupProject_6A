<?php
require_once "autoload.php";

$worker1 = new Worker(1, "Nicola", Industry::ADMINISTRATION);
$worker2 = new Worker(2, "Leo", Industry::COMPUTING);
$worker3 = new Worker(3, "Rene", Industry::ENGINEERING);
echo implode(' | ', Worker::$WORKER_LIST);
