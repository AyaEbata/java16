# Java 16を雑に触ってみる！

## SDKMANでJava 16を入れる
```
$ sdk install java 16.ea.36-open
$ sdk default java 16.ea.36-open
$ java --version 
openjdk 16 2021-03-16
```

Java 16入った！！！

## OpenJDKの16のページを見ていくつかやってみる〜
これ http://openjdk.java.net/projects/jdk/16/

### JEP 395: Records
https://openjdk.java.net/jeps/395

- 拡張可能な動作ではなく、不変のデータのモデリングに集中できるようになる
- レコードクラスの宣言は、名前、オプションの型パラメーター、ヘッダー、および本文で構成される
    - `record Point(int x, int y) { }` こんな感じに
    - equalsやaccessorsなどは自動的に生成してくれる

### JEP 394: Pattern Matching for instanceof
https://openjdk.java.net/jeps/394

- パターンマッチングで使うよ！
- 型だけでなく型パターンの変数を取るように拡張

### JEP 369: Migrate to GitHub
https://openjdk.java.net/jeps/369

- GitHubに移行されたよ！！
- ここだよ！！ https://github.com/openjdk/jdk

## ちゃんと上記でJava 16が入ったことを確認したけどIntelliJで怒られた！！
まだリリースしてないので、設定してもIntelliJ自体が対応してないみたい…？
