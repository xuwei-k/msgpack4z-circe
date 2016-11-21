package msgpack4z

object JavaSpec extends SpecBase {
  override protected[this] def packer() = new MsgpackJavaPacker()
  override protected[this] def unpacker(bytes: Array[Byte]) = MsgpackJavaUnpacker.defaultUnpacker(bytes)
}
