public class index {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{
                0x13, 0x55, (byte) 0xb6, 0x76,
                0x79, (byte) 0x88, 0x29, 0x5e,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x03, 0x00, 0x34,
                0x7e, 0x58, 0x1e, 0x36,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00

        };


        int part1 = bytes[0]&0xff; // 0001 0011 & 1011 0110
        int part2 = bytes[1]&0xff;

       String SourcePort = part1+""+part2;
        System.out.println("SourcePort: " +SourcePort);


        ///Destination port

        int part3 = bytes[2]&0xff; // 0001 0011 & 1011 0110
        int part4 = bytes[3]&0xff;

        String DestinationPort = part3+""+part4;
        System.out.println("DestinationPort: " +DestinationPort);

        //Verification tag

    }
}
