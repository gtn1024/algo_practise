<?php
// https://www.luogu.com.cn/problem/P5725
fscanf(STDIN, '%d', $n); {
  $c = 1;
  for ($i = 0; $i < $n; $i++) {
    for ($j = 0; $j < $n; $j++) {
      if ($c < 10) echo 0;
      echo $c;
      $c++;
    }
    echo PHP_EOL;
  }
  echo PHP_EOL;
  $c = 1;
  for ($i = 1; $i <= $n; $i++) {
    for ($j = $n - $i; $j > 0; $j--) {
      echo '  ';
    }
    for ($j = 0; $j < $i; $j++) {
      if ($c < 10) echo 0;
      echo $c;
      $c++;
    }
    echo PHP_EOL;
  }
}
